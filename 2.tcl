gets stdin n;
for {set i 0} {$i < $n} {incr i} {
	gets stdin str$i;
}
set count 0;
for {set i 0} {$i < $n} {incr i} {
	for {set j [expr $i+1]} {$j < $n} {incr j} {
		if { [expr [string index [set str[set i]] $j] == 0]} {
			for {set k 0} {$k < $n} {incr k} {
				
			}
			if {[expr [set checkx[set i]]==1 && [set checky[set j]]==1]} {
				set count [expr $count+1];
			}
		}
	}
}
puts "[expr 2*$count]"