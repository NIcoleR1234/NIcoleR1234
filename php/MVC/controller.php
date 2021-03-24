<?php
//* mvc complete
require_once('model.php');
$name='';
$data = null;
if (!empty($_REQUEST['viewid'])) {
    $row = MyModel::getModel()->getDataForId($_REQUEST['viewid']);
    $personID = $row['personID'];
    $person_name = $row['person_name'];
    $provider_number = $row['provider_number'];
    $locationID = $row['locationID'];
    require_once('detailsView.php');
    exit(1);
}
if (!empty($_REQUEST['deleteid'])) {
    

    // call a function in the model that deletes the record
    MyModel::getModel()->deleteDataForID($_REQUEST['deleteid']);
    
    require_once('searchView.php');
exit(1);
    
}
if (!empty($_REQUEST['save']) || !empty($_REQUEST['back'])) {
    if (!empty($_REQUEST['save'])) {
        MyModel::getModel()->editDataforId($_REQUEST['person_name'], $_REQUEST['provider_number'], $_REQUEST['locationID'], $_REQUEST['editid']);
        
    }
    require_once('searchView.php');
        exit(1);
}
if (!empty($_REQUEST['editid'])) {
     
    $row = MyModel::getModel()->getDataForId($_REQUEST['editid']);
    $personID = $row['personID'];
    $person_name = $row['person_name'];
    $provider_number = $row['provider_number'];
    $locationID = $row['locationID'];
    require_once('editView.php');
    
   exit(1);
   
    
}

if (!empty($_REQUEST['name'])) {
    $name = $_REQUEST['name'];
    $data = MyModel::getModel()->getDataForName($name);
} else {
    $name = MyModel::getModel()->getNameFromSession();
    $data = MyModel::getModel()->getDataFromSession();
    
}
require_once('searchView.php');
exit(1);
