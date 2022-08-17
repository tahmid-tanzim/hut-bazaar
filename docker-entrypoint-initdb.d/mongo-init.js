/* Create Database for Development, Test & Production */
db = db.getSiblingDB('hutbazaar_dev_db');
db.createUser(
    {
        user: 'tanzim',
        pwd: 'C0v1D19',
        roles: [
            {
                role: 'readWrite',
                db: 'hutbazaar_dev_db'
            }
        ],
    },
);
db.createCollection('users');