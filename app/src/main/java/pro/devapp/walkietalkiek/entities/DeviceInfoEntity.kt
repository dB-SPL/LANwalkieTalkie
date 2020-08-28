package pro.devapp.walkietalkiek.entities

data class DeviceInfoEntity(
    val deviceId: String,
    val name: String,
    val serviceName: String
) : Entity