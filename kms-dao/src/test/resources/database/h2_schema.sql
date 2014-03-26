SET MODE MYSQL;

-- --------------------------------------------------------

--
-- Table structure for table us_app
--

CREATE TABLE IF NOT EXISTS user (
  id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(31) NOT NULL,
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  create_time datetime NOT NULL,
  update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);