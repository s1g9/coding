proc gcd {num den} {
	set a 0;
	if {$num == 0} {
		return 1;
	}
	if {[expr $den % $num] == 0} {
		return $num;
	}
	set a [gcd [expr $den % $num] $num];
	return $a;
}

gets stdin T
for {set i 0} {$i < $T} {incr i} {
	gets stdin list
set arr [split $list " "]
set N [lindex $arr 0]
set M [lindex $arr 1]
if {[expr [expr $M % 2]*[expr $N % 2]] == 1 } {
	set num [expr [expr $M * $N - 1]/2]
	set den [expr $M * $N]
	set com [gcd $num $den]
	puts "[expr $num / $com]/[expr $den / $com]"
} else {puts "1/2"}
}


