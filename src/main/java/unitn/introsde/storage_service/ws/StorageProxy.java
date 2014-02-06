package unitn.introsde.storage_service.ws;

public class StorageProxy implements unitn.introsde.storage_service.ws.Storage {
  private String _endpoint = null;
  private unitn.introsde.storage_service.ws.Storage storage = null;
  
  public StorageProxy() {
    _initStorageProxy();
  }
  
  public StorageProxy(String endpoint) {
    _endpoint = endpoint;
    _initStorageProxy();
  }
  
  private void _initStorageProxy() {
    try {
      storage = (new unitn.introsde.storage_service.ws.StorageServiceLocator()).getStorageImplPort();
      if (storage != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)storage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)storage)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (storage != null)
      ((javax.xml.rpc.Stub)storage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public unitn.introsde.storage_service.ws.Storage getStorage() {
    if (storage == null)
      _initStorageProxy();
    return storage;
  }
  
  public unitn.introsde.storage_service.ws.Measurehistory[] trackGoalbyUser(int user_id, int goal_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.trackGoalbyUser(user_id, goal_id);
  }
  
  public unitn.introsde.storage_service.ws.Goal readGoal(int goal_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readGoal(goal_id);
  }
  
  public unitn.introsde.storage_service.ws.Measurehistory[] getMeaHisByTimeRange(int user_id, int meaDef_id, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getMeaHisByTimeRange(user_id, meaDef_id, fromDate, toDate);
  }
  
  public unitn.introsde.storage_service.ws.User[] searchUserbyName(java.lang.String searchString, int max) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.searchUserbyName(searchString, max);
  }
  
  public unitn.introsde.storage_service.ws.User[] getAllUser() throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getAllUser();
  }
  
  public unitn.introsde.storage_service.ws.Caregiver[] searchCareGiverbyName(java.lang.String searchString, int max) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.searchCareGiverbyName(searchString, max);
  }
  
  public java.lang.String searchFatSecretFood(java.lang.String searchText) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.searchFatSecretFood(searchText);
  }
  
  public unitn.introsde.storage_service.ws.User readUser(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readUser(user_id);
  }
  
  public int createUSer(unitn.introsde.storage_service.ws.User user) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createUSer(user);
  }
  
  public int updateUser(unitn.introsde.storage_service.ws.User user) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateUser(user);
  }
  
  public boolean removeUser(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeUser(user_id);
  }
  
  public int createGoal(unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createGoal(goal);
  }
  
  public int updateGoal(unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateGoal(goal);
  }
  
  public boolean removeGoal(int goal_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeGoal(goal_id);
  }
  
  public boolean removeGoalByCaregiver(int cg_id, int goal_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeGoalByCaregiver(cg_id, goal_id);
  }
  
  public boolean removeGoalByUser(int user_id, int goal_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeGoalByUser(user_id, goal_id);
  }
  
  public int updateGoalByUser(int user_id, unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateGoalByUser(user_id, goal);
  }
  
  public int updateGoalByCaregiver(int cg_id, unitn.introsde.storage_service.ws.Goal goal) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateGoalByCaregiver(cg_id, goal);
  }
  
  public unitn.introsde.storage_service.ws.Caregiver readCaregiver(int caregiver_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readCaregiver(caregiver_id);
  }
  
  public int createCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createCaregiver(caregiver);
  }
  
  public int updateCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateCaregiver(caregiver);
  }
  
  public boolean removeCaregiver(int caregiver_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeCaregiver(caregiver_id);
  }
  
  public unitn.introsde.storage_service.ws.Goal[] getGoalsbyUserId(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getGoalsbyUserId(user_id);
  }
  
  public unitn.introsde.storage_service.ws.Goal[] getGoalsbyCaregiverId(int cg_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getGoalsbyCaregiverId(cg_id);
  }
  
  public unitn.introsde.storage_service.ws.Measuredefinition readMeaDef(int meaDef_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readMeaDef(meaDef_id);
  }
  
  public int createMeaDef(unitn.introsde.storage_service.ws.Measuredefinition meaDef) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createMeaDef(meaDef);
  }
  
  public int updateMeaDef(unitn.introsde.storage_service.ws.Measuredefinition meaDef) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateMeaDef(meaDef);
  }
  
  public boolean removeMeaDef(int meaDef_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeMeaDef(meaDef_id);
  }
  
  public unitn.introsde.storage_service.ws.Measurehistory readMeasureHistory(int measureHistory_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readMeasureHistory(measureHistory_id);
  }
  
  public int creatMeasureHistory(unitn.introsde.storage_service.ws.Measurehistory measureHistory) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.creatMeasureHistory(measureHistory);
  }
  
  public int updateMeasureHistory(int user_id, unitn.introsde.storage_service.ws.Measurehistory measurehistory) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateMeasureHistory(user_id, measurehistory);
  }
  
  public int createLifeStatus(unitn.introsde.storage_service.ws.Lifestatus lifeStatus) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createLifeStatus(lifeStatus);
  }
  
  public int updateLifeStatus(int user_id, unitn.introsde.storage_service.ws.Lifestatus lifestatus) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateLifeStatus(user_id, lifestatus);
  }
  
  public unitn.introsde.storage_service.ws.Lifestatus readLifeStatus(int lifeStatus_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readLifeStatus(lifeStatus_id);
  }
  
  public boolean removeLifeStatus(int lifeStatus_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeLifeStatus(lifeStatus_id);
  }
  
  public unitn.introsde.storage_service.ws.Externalsource readFoodSource(int foodSource_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readFoodSource(foodSource_id);
  }
  
  public int createFoodSource(unitn.introsde.storage_service.ws.Externalsource foodSource) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createFoodSource(foodSource);
  }
  
  public int updateFoodSource(unitn.introsde.storage_service.ws.Externalsource foodSource) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateFoodSource(foodSource);
  }
  
  public boolean removeFoodSource(int foodSource_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeFoodSource(foodSource_id);
  }
  
  public unitn.introsde.storage_service.ws.Food readLocalFood(int localFood_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readLocalFood(localFood_id);
  }
  
  public int createLocalFood(unitn.introsde.storage_service.ws.Food localFood) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createLocalFood(localFood);
  }
  
  public int updateLocalFood(unitn.introsde.storage_service.ws.Food localFood) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateLocalFood(localFood);
  }
  
  public boolean removeLocalFood(int localFood_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeLocalFood(localFood_id);
  }
  
  public unitn.introsde.storage_service.ws.Food[] getLocalFoodsbyUserId(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getLocalFoodsbyUserId(user_id);
  }
  
  public unitn.introsde.storage_service.ws.Foodtrack readFoodTrack(int foodTrack_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readFoodTrack(foodTrack_id);
  }
  
  public int createFoodTrack(unitn.introsde.storage_service.ws.Foodtrack foodTrack) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createFoodTrack(foodTrack);
  }
  
  public int updateFoodTrack(unitn.introsde.storage_service.ws.Foodtrack foodTrack) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateFoodTrack(foodTrack);
  }
  
  public boolean removeFoodTrack(int foodTrack_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeFoodTrack(foodTrack_id);
  }
  
  public unitn.introsde.storage_service.ws.Foodtrack[] getFoodTracksByUserId(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getFoodTracksByUserId(user_id);
  }
  
  public unitn.introsde.storage_service.ws.Foodtrack[] getFoodTrackOfUserByTimeRange(int user_id, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getFoodTrackOfUserByTimeRange(user_id, fromDate, toDate);
  }
  
  public java.lang.String getFoodInforOfFoodTrack(int foodTrack_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getFoodInforOfFoodTrack(foodTrack_id);
  }
  
  public int getFoodCaloriesOfFoodTrack(int foodTrack_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getFoodCaloriesOfFoodTrack(foodTrack_id);
  }
  
  public unitn.introsde.storage_service.ws.Scheduledtask readTask(int task_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.readTask(task_id);
  }
  
  public int createTask(unitn.introsde.storage_service.ws.Scheduledtask task) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.createTask(task);
  }
  
  public int updateTask(unitn.introsde.storage_service.ws.Scheduledtask task) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.updateTask(task);
  }
  
  public boolean removeTask(int task_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.removeTask(task_id);
  }
  
  public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksByUserId(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getTasksByUserId(user_id);
  }
  
  public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksByCaregiverId(int cg_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getTasksByCaregiverId(cg_id);
  }
  
  public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksTodayByUserId(int user_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getTasksTodayByUserId(user_id);
  }
  
  public unitn.introsde.storage_service.ws.Scheduledtask[] getTasksTodayByCaregiverId(int cg_id) throws java.rmi.RemoteException{
    if (storage == null)
      _initStorageProxy();
    return storage.getTasksTodayByCaregiverId(cg_id);
  }
  
  
}