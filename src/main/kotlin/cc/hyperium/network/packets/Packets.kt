package cc.hyperium.network.packets

import kotlin.reflect.KClass

enum class PacketType(val ID: Int, val clazz: KClass<*>) {
    HEARTBEAT(0, Heartbeat::class),
    CROSS_CLIENT_DATA(1, CrossClientData::class);
}