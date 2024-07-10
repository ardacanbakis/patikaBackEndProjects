--film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
SELECT rating, COUNT(*) FROM film
GROUP BY rating ORDER BY rating ASC;

--film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
SELECT replacement_cost, COUNT(replacement_cost) FROM film
GROUP BY replacement_cost 
HAVING (COUNT(replacement_cost) > 50)
ORDER BY COUNT(replacement_cost) ASC;
-- NICE COUNT USAGE.

--customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?
SELECT store_id, COUNT(*) FROM customer 
GROUP BY store_id;
--city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
SELECT country_id, COUNT(*) from city
GROUP BY country_id ORDER BY COUNT(*) DESC;