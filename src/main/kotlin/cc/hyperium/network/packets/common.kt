package cc.hyperium.network.packets

class Heartbeat(val time: Long) : IPacket(PacketType.HEARTBEAT) {
    // NECESSARY for instantiation via Kryo
    constructor() : this(-1)

    override fun toString(): String {
        return "HeartbeatPacket{$ID,time=$time}"
    }
}

class CrossClientData(val data: Any) : IPacket(PacketType.CROSS_CLIENT_DATA) {
    constructor() : this("<EMPTY>")

    override fun toString(): String {
        return "CCDPacket{$ID,data=$data}"
    }
}