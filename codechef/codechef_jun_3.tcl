proc decode {no} {
	for {set i 0} {$i < $no} {incr i} {
	gets stdin list_$i
	set arr_$i [split [set list_$i] " "]
	set a_$i [lindex [set arr_$i] 0]
	set b_$i [lindex [set arr_$i] 1]
	}
	gets stdin string
	set array [split $string ""]

	for {set i 0} {$i < $no} {incr i} {
		set a [lsearch -all $array [set a_$i]]
		for {set i 0} {$i < [llength $a]} {incr i} {
			set [lindex $array [lindex $a $i]] [lindex]
		}
			
		}
		# for {set j 0} {$j < $no} {incr i} {
		# 	if {[lindex $array $i] == [set a_$i]} {
		# 		[lindex $array $i] == [set b_$i]
		# 	}
		}
	}
	return $array;
}


proc simplify {ans} {

}

gets stdin T
for {set i 0} {$i < $T} {incr i} {
	gets stdin no ;
	set ans [decode $no];
	set realans [simplify $ans]



}