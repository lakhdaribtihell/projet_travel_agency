const mysql = require("mysql2/promise");

const pool = mysql.createPool({
  host: "localhost",
  user: "root",
  password: "",      // ton mot de passe MySQL
  database: "travel_agency"
});

module.exports = pool;
