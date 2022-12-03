package run.halo.bbs;

import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.plugin.BasePlugin;

/**
 * @author Seale
 * @since 2.0.0
 */
@Component
@Slf4j
public class StarterPlugin extends BasePlugin {

    public StarterPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.info("插件启动成功");
    }

    @Override
    public void stop() {
        System.out.println("插件停止！");
    }
}
