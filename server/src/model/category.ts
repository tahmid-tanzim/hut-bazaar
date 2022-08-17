import { Schema, model, connect } from 'mongoose';

// 1. Create an interface representing a document in MongoDB.
interface IUser {
  name: string;
  email: string;
  avatar?: string;
}

// 2. Create a Schema corresponding to the document interface.
const userSchema = new Schema<IUser>({
  name: { type: String, required: true },
  email: { type: String, required: true },
  avatar: String
});

// 3. Create a Model.
const User = model<IUser>('User', userSchema);

export const run_mongo = async () => {
  // 4. Connect to MongoDB
  const connection_string: string = process.env.MONGODB_CONNSTRING ?? '';
  console.log(connection_string);
  await connect(connection_string); 
  const user = new User({
    name: 'Bill Gates 2',
    email: 'bill@initech.com',
    avatar: 'https://i.imgur.com/dM7Thhn.png'
  });
  await user.save();

  console.log(user.email); // 'bill@initech.com'
}