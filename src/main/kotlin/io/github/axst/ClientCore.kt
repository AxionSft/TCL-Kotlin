package io.github.axst

class ClientCore {

    companion object Instances {
        @JvmStatic
        val instance: ClientCore = ClientCore()
    }

    fun initializeClient() {
        println("My First Injection!")
    }
}