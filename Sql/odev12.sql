################## SORULAR ####################

1-) film tablosunda film uzunluðu length sütununda gösterilmektedir. Uzunluðu ortalama film uzunluðundan fazla kaç tane film vardýr?
2-) film tablosunda en yüksek rental_rate deðerine sahip kaç tane film vardýr?
3-) film tablosunda en düþük rental_rate ve en düþün replacement_cost deðerlerine sahip filmleri sýralayýnýz.
4-) payment tablosunda en fazla sayýda alýþveriþ yapan müþterileri(customer) sýralayýnýz

################## ÇÖZÜMLER ####################

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