# Walkie Talkie over WiFi

The app works on the local network without server. Each app instance is a server.
App find other devices through NsdManager
Sending data over SocketChannel (java.nio.channels)

## TODO:

- ping (check connection by timer)
- send only if has active client
- add limit to send queue
- ui
- added talk button to foreground notification
- ConcurrentHashMap
- switch between audio outputs

https://github.com/aahlenst/android-audiorecord-sample
//android.os.Process.setThreadPriority( Process.THREAD_PRIORITY_URGENT_AUDIO );