package adapters.dto;

import java.util.Objects;

public class AccountDto {

    private String name;
    private String email;
    private Boolean flActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFlActive() {
        return flActive;
    }

    public void setFlActive(Boolean flActive) {
        this.flActive = flActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDto that = (AccountDto) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(flActive, that.flActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, flActive);
    }
}
