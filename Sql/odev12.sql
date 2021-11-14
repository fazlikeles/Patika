################## SORULAR ####################

1-) film tablosunda film uzunlu�u length s�tununda g�sterilmektedir. Uzunlu�u ortalama film uzunlu�undan fazla ka� tane film vard�r?
2-) film tablosunda en y�ksek rental_rate de�erine sahip ka� tane film vard�r?
3-) film tablosunda en d���k rental_rate ve en d���n replacement_cost de�erlerine sahip filmleri s�ralay�n�z.
4-) payment tablosunda en fazla say�da al��veri� yapan m��terileri(customer) s�ralay�n�z

################## ��Z�MLER ####################

1-)
 SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film)

2-)
 SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film)

3-)
 SELECT * FROM film WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) 
 AND replacement_cost = (SELECT MIN(replacement_cost) FROM film)
4-)
 SELECT customer.first_name ||' '|| customer.last_name, COUNT(*) FROM payment LEFT JOIN customer
 ON customer.customer_id = payment.customer_id
 GROUP BY payment.customer_id,customer.first_name, customer.last_name
 ORDER BY COUNT(*) DESC