####################### SORULAR #####################

1-)actor ve customer tablolar�nda bulunan first_name s�tunlar� i�in t�m verileri s�ralayal�m.
2-)actor ve customer tablolar�nda bulunan first_name s�tunlar� i�in kesi�en verileri s�ralayal�m.
3-)actor ve customer tablolar�nda bulunan first_name s�tunlar� i�in ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri s�ralayal�m.

####################### ��Z�MLER #####################

1-)
 SELECT first_name FROM actor 
 UNION ALL
 SELECT first_name FROM customer

2-)
 SELECT first_name FROM actor 
 INTERSECT
 SELECT first_name FROM customer
3-)
 SELECT first_name FROM actor 
 EXCEPT 
 SELECT first_name FROM customer
 
 -- �lk �� soruda zaten tekrar eden veriler geliyor. Sadece 4. soruda
 -- Tekrar eden verileri getirmek i�in EXCEPT yerine EXCEPT ALL kulland�m.
4-)
 SELECT first_name FROM actor 
 EXCEPT ALL
 SELECT first_name FROM customer







