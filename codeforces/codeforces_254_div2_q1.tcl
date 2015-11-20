gets stdin var;
for {set i 0} {$i < [lindex $var 0]} {incr i} {
	gets stdin str$i;
}
for {set i 0} {$i < [lindex $var 0]} {incr i} {
	for {set j 0} {$j < [lindex $var 1]} {incr j} {
		set a [string index [set str[set i]] $j];
		set ai "yo";
		if {$j!=0} {
		set ai [string index [set str[set i]] [expr $j - 1]];
		}
		set aj "yo";
		if {$i!=0} {
			set aj [string index [set str[expr $i - 1]] $j];
		}
		
		if { [string match *.* $a] } {
				if { [string match *B* $ai] } {
					set str[set i] [string replace [set str[set i]] $j $j "W"];
					continue;
				}
				if { [string match *B* $aj] && $i!=0} {
					set str[set i] [string replace [set str[set i]] $j $j "W"];
					continue;
				}
				set str[set i] [string replace [set str[set i]] $j $j "B"];
				continue;
			}
	}
}
for {set i 0} {$i < [lindex $var 0]} {incr i} {
	puts "[set str[set i]]";
}