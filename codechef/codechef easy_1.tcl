while {	[string length [gets stdin var]]>0 } {
	if { [expr $var == 42] } {
		break;
	}
	puts "$var";
}