gets stdin T
for {set i 0} {$i < $T} {incr i} {
gets stdin list
set n [lindex $list 0]
set m [lindex $list 1]
if { [expr [expr $n % 2]*[expr $m % 2] ] == 1 } {
	set num [expr [expr [expr $m * $n] - 1]/2]
	set den [expr $m * $n]
	puts "$num/$den"
} else { puts "1/2"}
}


