package pl.cule.kingdom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PlayerInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private boolean enabled;
    private int gold = 0;

    public PlayerInformation() {
    }

    public PlayerInformation(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
