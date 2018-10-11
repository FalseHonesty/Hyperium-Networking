package cc.hyperium.network.packets

enum class Packets(val ID: Int, val clazz: Class<*>) {
    HEARTBEAT(0, Heartbeat::class.java);

    fun newInstance(): IPacket {
        return create(this)
    }

    fun <T : IPacket> newInstanceAs(): T {
        return newInstance() as T
    }

    companion object {
        fun create(type: Packets): IPacket {
            return when (type) {
                HEARTBEAT -> Heartbeat(System.currentTimeMillis())
                else -> TODO("The Packet Type $type cannot be automatically instantiated!")
            }
        }

        fun forEach(function: (Class<*>) -> Unit) {
            Packets.values().forEach {
                function(it.clazz)
            }
        }
    }
}