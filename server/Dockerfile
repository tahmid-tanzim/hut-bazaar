# First stage: compile things.
FROM node:16-alpine3.15 AS build

# Create app directory
WORKDIR /usr/src/app

# Install the Javascript dependencies, including all devDependencies.
COPY package.json .
RUN npm install

# Copy the rest of the application in and build it.
COPY . .

# RUN npm build
RUN npx tsc -p ./tsconfig.json

# Second stage: run things.
FROM node:16-alpine3.15
WORKDIR /usr/src/app

# Install the Javascript dependencies, only runtime libraries.
COPY package.json .
RUN npm install --production

# Copy the dist tree from the first stage.
COPY --from=build /usr/src/app/dist dist
COPY --from=build /usr/src/app/.env .

# Run the built application when the container starts.
EXPOSE 8000
CMD ["npm", "start"]
