public class Administrator implements AccessControl {
    @Override
    public String getRole() {
        return "Administrator";
    }

    @Override
    public int getAccessLevel() {
        return 3;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}