object main extends App{
    val alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val encrypt = (c:Char,shift:Int,a:String) => a((a.indexOf(c.toUpper)+shift)%a.size);

    val decrypt = (c:Char,shift:Int,a:String) => a((a.indexOf(c.toUpper)-shift)%a.size);

    val cipher = (algo:(Char,Int,String)=>Char,s:String,shift:Int,a:String)=>s.map(algo(_,shift,a));

    val s:String ="Hello There"
    val s2:String ="JGNNQBVJGTG"
    val e = cipher(encrypt,s,2,alphabet);
    println(e);

    val de = cipher(decrypt,e,2,alphabet);
    println(de);
}