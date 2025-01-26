package com.sumit.java17.a_sealed_classes;

// example: sealed -> final

sealed class a permits b,c{
}

final class b extends a {
}
final class c extends a {
}


// example: sealed -> sealed -> final
sealed class p permits q{
}

sealed class q extends p permits r{
}

final class r extends q {
}












public class SC_Example1 {
}
