package cmbi.shop.entity;

import lombok.Data;

@Data
public class AppEntity {
    private String appId;
    private String appName;

    public AppEntity() {
    }
    public AppEntity(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}
