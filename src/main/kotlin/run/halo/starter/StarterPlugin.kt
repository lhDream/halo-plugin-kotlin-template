package run.halo.starter

import org.springframework.stereotype.Component
import run.halo.app.plugin.BasePlugin
import run.halo.app.plugin.PluginContext

/**
 * <p>Plugin main class to manage the lifecycle of the plugin.</p>
 * <p>This class must be public and have a public constructor.</p>
 * <p>Only one main class extending {@link BasePlugin} is allowed per plugin.</p>
 *
 * @author lhDream
 * @since 1.0.0
 */
@Component
open class StarterPlugin(pluginContext: PluginContext): BasePlugin(pluginContext) {

    override fun start() {
        println("Plug-in started successfully!")
    }

    override fun stop() {
        println("Plugin stopped!")
    }

}