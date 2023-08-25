package pl.slawek.model.soldiers.action;

public class Action {
    String actionName;

    public String getActionName() {
        return actionName;
    }

    void setActionName(final String actionName) {
        this.actionName = actionName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Action action = (Action) o;

        return actionName.equals(action.actionName);
    }

    @Override
    public int hashCode() {
        return actionName.hashCode();
    }
}
