for $baile in doc ("bailes.xml")//bailes/baile
where $baile/precio/@cuota = "mensual"
return
<baile>
<nombre>{$baile/nombre/text()}</nombre>
<dia_comienzo>{days-from-duration(xs:date($baile/comienzo))}</dia_comienzo>
<mes_comienzo>{month-from-date($baile/comienzo)}</mes_comienzo>
<anio_comienzo>{year-from-date($baile/comienzo)}</anio_comienzo>
</baile>