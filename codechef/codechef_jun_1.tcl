
proc maximum {no list} {
	set arr [split $list " "]
	set b 0
	set a 0
	
for {set i 0} {$i < $no} {incr i} {
	if {[lindex $arr $i] == 0 } {
		if {$b < $a} {
			set b $a;
		}
	set a -1;
	}
incr a 1;
}
if {$a == $no} {
	return $a;
}
return $b;
}

gets stdin no
gets stdin list
set ans [maximum $no $list]
puts "$ans"
