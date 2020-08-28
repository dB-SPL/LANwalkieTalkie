package pro.devapp.walkietalkiek.data

import android.content.Context
import android.os.Build
import android.util.Base64
import pro.devapp.utils.getDeviceID
import pro.devapp.walkietalkiek.entities.DeviceInfoEntity

class DeviceInfoRepository(private val context: Context) {
    fun getCurrentDeviceInfo(): Result<DeviceInfoEntity> {
        val name =
            Build.MANUFACTURER + " " + Build.MODEL + " " + Build.VERSION.RELEASE + " " + Build.VERSION.SDK_INT
        val deviceId = getDeviceID(context.contentResolver)
        val encodedName = Base64.encodeToString(
            name.toByteArray(),
            Base64.NO_PADDING or Base64.NO_WRAP
        )
        val serviceName = "$encodedName:$deviceId:"
        return Result.success(
            DeviceInfoEntity(
                deviceId,
                name,
                serviceName
            )
        )
    }

    fun getCurrentServiceName() {

    }
}