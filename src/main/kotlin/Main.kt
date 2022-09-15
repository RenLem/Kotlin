fun main(args: Array<String>) {

    val developer = Developer(DesignDwarf(), CodeGremlin())
    developer.design()
    developer.code()
}

internal interface WhoDesign{
    fun design(){

    }
}

internal interface WhoCode{
    fun code(){

    }
}

internal class Developer(designDwarf: DesignDwarf, codeGremlin: CodeGremlin): WhoDesign by designDwarf, WhoCode by codeGremlin {

    /*
    Not needed

    override fun design() {
        super.design()
    }

    override fun code() {
        super.code()
    }
    */

}

internal class DesignDwarf: WhoDesign{

    override fun design() {
        println("Developer has dwarf to design")
    }

}

internal class CodeGremlin: WhoCode{
    override fun code() {
        println("Gremlin is coding for developer")
    }

}