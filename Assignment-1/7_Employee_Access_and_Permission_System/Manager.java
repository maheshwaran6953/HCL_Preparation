public class Manager implements AccessControl {
    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public int getAccessLevel() {
        return 2;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}