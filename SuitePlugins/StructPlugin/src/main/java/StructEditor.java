import store.plugin.PluginType;
import suite.controller.ConfigEditor;
import utility.ConfigEditorInfo;

/**
 * @author Rocky on 01/23/2023
 * https://www.rune-server.ee/members/rocky/
 * @project ValkyrCacheSuite
 */
public class StructEditor extends ConfigEditor {

    @Override
    public ConfigEditorInfo getInfo() {
        return ConfigEditorInfo.builder().index(2).archive(34).type(PluginType.STRUCT).build();
    }

}