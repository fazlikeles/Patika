################ SORULAR ################

1-) test veritabanýnýzda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluþturalým.
2-) Oluþturduðumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
3-) Sütunlarýn her birine göre diðer sütunlarý güncelleyecek 5 adet UPDATE iþlemi yapalým.
4-) Sütunlarýn her birine göre ilgili satýrý silecek 5 adet DELETE iþlemi yapalým.

################ ÇÖZÜMLER ################

1- )CREATE DATABASE test

CREATE TABLE employee (
	ID SERIAL PRIMARY KEY,
	name VARCHAR(50),
	birth_date DATE,
	email VARCHAR(100) );
	
2-) insert into employee (name, birth_date, email) values ('Mortie Havick', '1956-01-25', 'mhavick0@eepurl.com');
insert into employee (name, birth_date, email) values ('Hymie Raccio', '1970-06-27', 'hraccio1@google.co.jp');
insert into employee (name, birth_date, email) values ('Alister Hughesdon', '1988-10-14', 'ahughesdon2@berkeley.edu');
insert into employee (name, birth_date, email) values ('Ardella Vedeniktov', '1963-05-10', 'avedeniktov3@mail.ru');
insert into employee (name, birth_date, email) values ('Mohandis Marcussen', '1971-01-18', 'mmarcussen4@merriam-webster.com');
insert into employee (name, birth_date, email) values ('Nicola Haryngton', '1983-07-15', 'nharyngton5@last.fm');
insert into employee (name, birth_date, email) values ('Lynea Darbyshire', '1952-08-12', 'ldarbyshire6@smh.com.au');
insert into employee (name, birth_date, email) values ('Virge Bart', '1948-01-28', 'vbart7@sourceforge.net');
insert into employee (name, birth_date, email) values ('Austin Itzhak', '1948-04-18', 'aitzhak8@multiply.com');
insert into employee (name, birth_date, email) values ('Asia Norway', '1974-08-06', 'anorway9@multiply.com');
insert into employee (name, birth_date, email) values ('Lucien Biset', '1996-11-19', 'lbiseta@nba.com');
insert into employee (name, birth_date, email) values ('Nathalia Gourlay', '1990-01-12', 'ngourlayb@goo.gl');
insert into employee (name, birth_date, email) values ('Sheridan Carbery', '1986-05-10', 'scarberyc@addthis.com');
insert into employee (name, birth_date, email) values ('Gerardo Babon', '1957-06-25', 'gbabond@paginegialle.it');
insert into employee (name, birth_date, email) values ('Delcine Larrington', '1942-04-20', 'dlarringtone@tamu.edu');
insert into employee (name, birth_date, email) values ('Wileen Dibdale', '1996-08-02', 'wdibdalef@discuz.net');
insert into employee (name, birth_date, email) values ('Gert Gascoigne', '1980-11-25', 'ggascoigneg@uiuc.edu');
insert into employee (name, birth_date, email) values ('Heriberto Lukock', '1987-10-18', 'hlukockh@yale.edu');
insert into employee (name, birth_date, email) values ('Ody Carpe', '1947-04-23', 'ocarpei@nsw.gov.au');
insert into employee (name, birth_date, email) values ('Susana Aleksic', '1990-12-03', 'saleksicj@telegraph.co.uk');
insert into employee (name, birth_date, email) values ('Elora Gallienne', '1994-07-13', 'egalliennek@mapy.cz');
insert into employee (name, birth_date, email) values ('Bobinette Delgado', '1968-04-21', 'bdelgadol@wisc.edu');
insert into employee (name, birth_date, email) values ('Kerr MacSween', '1971-06-02', 'kmacsweenm@scribd.com');
insert into employee (name, birth_date, email) values ('Rosalyn Gronno', '1953-01-20', 'rgronnon@qq.com');
insert into employee (name, birth_date, email) values ('Lindsy Cullerne', '1942-08-08', 'lcullerneo@fotki.com');
insert into employee (name, birth_date, email) values ('Dudley Arington', '1998-03-28', 'daringtonp@php.net');
insert into employee (name, birth_date, email) values ('Gael Shillum', '1968-05-17', 'gshillumq@adobe.com');
insert into employee (name, birth_date, email) values ('Kimmy Elbourne', '1951-02-26', 'kelbourner@scribd.com');
insert into employee (name, birth_date, email) values ('Enos Dobkin', '1999-08-21', 'edobkins@dailymail.co.uk');
insert into employee (name, birth_date, email) values ('Pavel Morrallee', '1957-06-08', 'pmorralleet@vistaprint.com');
insert into employee (name, birth_date, email) values ('Orelle Revie', '1967-10-04', 'orevieu@ovh.net');
insert into employee (name, birth_date, email) values ('Shirline Penhalurick', '1968-07-26', 'spenhalurickv@reddit.com');
insert into employee (name, birth_date, email) values ('Lionel Lasty', '1982-09-07', 'llastyw@nationalgeographic.com');
insert into employee (name, birth_date, email) values ('Sheila-kathryn Jayme', '1952-11-03', 'sjaymex@geocities.jp');
insert into employee (name, birth_date, email) values ('Elsbeth Howson', '1976-07-27', 'ehowsony@multiply.com');
insert into employee (name, birth_date, email) values ('Brewer Wooffinden', '1997-11-08', 'bwooffindenz@example.com');
insert into employee (name, birth_date, email) values ('Theodosia O''Nowlan', '1950-09-27', 'tonowlan10@4shared.com');
insert into employee (name, birth_date, email) values ('Sile Pulford', '1947-05-16', 'spulford11@paypal.com');
insert into employee (name, birth_date, email) values ('Francis Gloy', '1959-11-16', 'fgloy12@comcast.net');
insert into employee (name, birth_date, email) values ('Flossie Hambleton', '1959-08-15', 'fhambleton13@360.cn');
insert into employee (name, birth_date, email) values ('Chickie Brayne', '1994-09-05', 'cbrayne14@columbia.edu');
insert into employee (name, birth_date, email) values ('Anneliese Langtry', '1964-05-01', 'alangtry15@dailymail.co.uk');
insert into employee (name, birth_date, email) values ('Dell Tondeur', '1958-08-24', 'dtondeur16@skype.com');
insert into employee (name, birth_date, email) values ('Maude Bock', '1971-08-04', 'mbock17@google.pl');
insert into employee (name, birth_date, email) values ('Cayla Reed', '1943-06-17', 'creed18@creativecommons.org');
insert into employee (name, birth_date, email) values ('Honoria Meaney', '1950-06-02', 'hmeaney19@who.int');
insert into employee (name, birth_date, email) values ('Adela McParland', '1950-09-15', 'amcparland1a@netvibes.com');
insert into employee (name, birth_date, email) values ('Mikol Tilbrook', '1995-09-03', 'mtilbrook1b@wikispaces.com');
insert into employee (name, birth_date, email) values ('Mady Hooban', '1984-11-01', 'mhooban1c@adobe.com');
insert into employee (name, birth_date, email) values ('Kelcey Inde', '1989-08-12', 'kinde1d@answers.com');
 
3-)
 --UPDATE--

 UPDATE employee 
 SET name = 'Kamil Turan'
 WHERE name LIKE 'K%'
 
 UPDATE employee
 SET name = 'Fazlý K.'
 WHERE name LIKE 'F%K'


UPDATE employee
SET email = 'fazli.keles.01@gmail.com'
WHERE birth_date > '1995-04-18'

4-)
-- DELETE --

DELETE  FROM employee
WHERE ID > 100


DELETE  FROM employee
WHERE name LIKE 'K%L%S'




