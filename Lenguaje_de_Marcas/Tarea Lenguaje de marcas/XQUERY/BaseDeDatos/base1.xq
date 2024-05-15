(: Extraer la ciudad de los proveedores (no debe aparecer la etiqueta) que tengan un estado mayor de 15. :)

let $doc := doc("Base.xml")

for $ciudad in $doc//proveedor
where $ciudad/estado > 15
return $ciudad/text()