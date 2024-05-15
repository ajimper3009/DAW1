(: Mostrar los bailes ordenados por nombre :)
for $nombre_baile in doc("bailes.xml")//baile/nombre
order by $nombre_baile/text() descending
return $nombre_baile/text()