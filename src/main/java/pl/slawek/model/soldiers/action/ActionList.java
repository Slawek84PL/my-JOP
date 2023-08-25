package pl.slawek.model.soldiers.action;

import java.util.HashMap;
import java.util.Map;

public class ActionList {
    Map<Integer, Action> actionList = new HashMap<>();

    public Map<Integer, Action> getActionList() {
        return actionList;
    }

    public void addActionToList(String actionName) {
        int id = this.actionList.size();
        Action action = new Action();
        action.setActionName(actionName);

        this.actionList.put(id, action);
    }
}
