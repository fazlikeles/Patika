####################### SORULAR #####################

1-)actor ve customer tablolarýnda bulunan first_name sütunlarý için tüm verileri sýralayalým.
2-)actor ve customer tablolarýnda bulunan first_name sütunlarý için kesiþen verileri sýralayalým.
3-)actor ve customer tablolarýnda bulunan first_name sütunlarý için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sýralayalým.

####################### ÇÖZÜMLER #####################

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
 
 -- Ýlk Üç soruda zaten tekrar eden veriler geliyor. Sadece 4. soruda
 -- Tekrar eden verileri getirmek için EXCEPT yerine EXCEPT ALL kullandým.
4-)
 SELECT first_name FROM actor 
 EXCEPT ALL
 SELECT first_name FROM customer







