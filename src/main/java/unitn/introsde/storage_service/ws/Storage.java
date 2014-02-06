/**
 * Storage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public interface Storage extends java.rmi.Remote {
    public unitn.introsde.storage_service.ws.Measurehistory[] trackGoalbyUser(int user_id, int goal_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Goal readGoal(int goal_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Measurehistory[] getMeaHisByTimeRange(int user_id, int meaDef_id, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.User[] searchUserbyName(java.lang.String searchString, int max) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.User[] getAllUser() throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Caregiver[] searchCareGiverbyName(java.lang.String searchString, int max) throws java.rmi.RemoteException;
    public java.lang.String searchFatSecretFood(java.lang.String searchText) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.User readUser(int user_id) throws java.rmi.RemoteException;
    public int createUSer(unitn.introsde.storage_service.ws.User user) throws java.rmi.RemoteException;
    public int updateUser(unitn.introsde.storage_service.ws.User user) throws java.rmi.RemoteException;
    public boolean removeUser(int user_id) throws java.rmi.RemoteException;
    public int createGoal(unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException;
    public int updateGoal(unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException;
    public boolean removeGoal(int goal_id) throws java.rmi.RemoteException;
    public boolean removeGoalByCaregiver(int cg_id, int goal_id) throws java.rmi.RemoteException;
    public boolean removeGoalByUser(int user_id, int goal_id) throws java.rmi.RemoteException;
    public int updateGoalByUser(int user_id, unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException;
    public int updateGoalByCaregiver(int cg_id, unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Caregiver readCaregiver(int caregiver_id) throws java.rmi.RemoteException;
    public int createCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) throws java.rmi.RemoteException;
    public int updateCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) throws java.rmi.RemoteException;
    public boolean removeCaregiver(int caregiver_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Goal[] getGoalsbyUserId(int user_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Goal[] getGoalsbyCaregiverId(int cg_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Measuredefinition readMeaDef(int meaDef_id) throws java.rmi.RemoteException;
    public int createMeaDef(unitn.introsde.storage_service.ws.Measuredefinition meaDef) throws java.rmi.RemoteException;
    public int updateMeaDef(unitn.introsde.storage_service.ws.Measuredefinition meaDef) throws java.rmi.RemoteException;
    public boolean removeMeaDef(int meaDef_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Measurehistory readMeasureHistory(int measureHistory_id) throws java.rmi.RemoteException;
    public int creatMeasureHistory(unitn.introsde.storage_service.ws.Measurehistory measureHistory) throws java.rmi.RemoteException;
    public int updateMeasureHistory(int user_id, unitn.introsde.storage_service.ws.Measurehistory measurehistory) throws java.rmi.RemoteException;
    public int createLifeStatus(unitn.introsde.storage_service.ws.Lifestatus lifeStatus) throws java.rmi.RemoteException;
    public int updateLifeStatus(int user_id, unitn.introsde.storage_service.ws.Lifestatus lifestatus) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Lifestatus readLifeStatus(int lifeStatus_id) throws java.rmi.RemoteException;
    public boolean removeLifeStatus(int lifeStatus_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Externalsource readFoodSource(int foodSource_id) throws java.rmi.RemoteException;
    public int createFoodSource(unitn.introsde.storage_service.ws.Externalsource foodSource) throws java.rmi.RemoteException;
    public int updateFoodSource(unitn.introsde.storage_service.ws.Externalsource foodSource) throws java.rmi.RemoteException;
    public boolean removeFoodSource(int foodSource_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Food readLocalFood(int localFood_id) throws java.rmi.RemoteException;
    public int createLocalFood(unitn.introsde.storage_service.ws.Food localFood) throws java.rmi.RemoteException;
    public int updateLocalFood(unitn.introsde.storage_service.ws.Food localFood) throws java.rmi.RemoteException;
    public boolean removeLocalFood(int localFood_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Food[] getLocalFoodsbyUserId(int user_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Foodtrack readFoodTrack(int foodTrack_id) throws java.rmi.RemoteException;
    public int createFoodTrack(unitn.introsde.storage_service.ws.Foodtrack foodTrack) throws java.rmi.RemoteException;
    public int updateFoodTrack(unitn.introsde.storage_service.ws.Foodtrack foodTrack) throws java.rmi.RemoteException;
    public boolean removeFoodTrack(int foodTrack_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Foodtrack[] getFoodTracksByUserId(int user_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Foodtrack[] getFoodTrackOfUserByTimeRange(int user_id, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;
    public java.lang.String getFoodInforOfFoodTrack(int foodTrack_id) throws java.rmi.RemoteException;
    public int getFoodCaloriesOfFoodTrack(int foodTrack_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Scheduledtask readTask(int task_id) throws java.rmi.RemoteException;
    public int createTask(unitn.introsde.storage_service.ws.Scheduledtask task) throws java.rmi.RemoteException;
    public int updateTask(unitn.introsde.storage_service.ws.Scheduledtask task) throws java.rmi.RemoteException;
    public boolean removeTask(int task_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksByUserId(int user_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksByCaregiverId(int cg_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksTodayByUserId(int user_id) throws java.rmi.RemoteException;
    public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksTodayByCaregiverId(int cg_id) throws java.rmi.RemoteException;
}
