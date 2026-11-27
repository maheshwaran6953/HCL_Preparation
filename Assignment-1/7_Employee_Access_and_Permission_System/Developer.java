public class Developer implements AccessControl {
    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public int getAccessLevel() {
        return 1;
    }

    @Override
    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}