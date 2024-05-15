(: Mostrar los nombres de los bailesque contengan una c:)
for $nombre_baile in doc("bailes.xml")//baile/nombre
where contains ($nombre_baile,"c")
return $nombre_baile/text()