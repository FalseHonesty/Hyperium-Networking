package cc.hyperium.network.packets

class Heartbeat(val time: Long) : IPacket(Packets.HEARTBEAT.ID) {
    // NECESSARY for instantiation via Kryo
    constructor() : this(-1)

    override fun toString(): String {
        return "Packet{$ID,time=$time}"
    }
}

class CrossClientData(val data: Any) : IPacket(Packets.CROSS_CLIENT_DATA.ID) {
    constructor() : this("<EMPTY>")

    override fun toString(): String {
        return "Packet{$ID,data=$data}"
    }
}