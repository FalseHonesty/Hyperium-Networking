package cc.hyperium.network.packets

import java.util.*

abstract class IPacket(val type: PacketType, val ID: UUID = UUID.randomUUID())