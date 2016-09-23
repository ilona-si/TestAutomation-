<?php


// echo "<pre>";
// print_r($_POST);
// echo "</pre>";
 	if (!isset($_POST['action'])) {
 		echo "Действие не выбрано!";
 		die();
 	}
 	if (!isset($_POST['a'])) {
 		echo "Число a не выбрано!";
 		die();
 	}
 	if (!isset($_POST['b'])) {
 		echo "Действие не выбрано!";
 		die();
 	}

$action=trim($_POST['action']);
$a=$_POST['a'];
$b=$_POST['b'];

 	switch ($action) {
 		case '+':
 		$str='a+b';
 			$rez=$a+$b;
 			break;
 		case '-':
 		$str='a-b';
 			$rez=$a-$b;
 			break;
 		case '/':
 		if ($_POST['b']==0) {
 		echo "На ноль нелить нельзя!";
 		die();
 		$str='a/b';
 		$rez=$a/$b;
 			
 	}
 			break;
 		case '*':
 		$str='a*b';
 			$rez=$a*$b;
 			break;
 	}

$string="a $action b";
echo "$string=$a$action$b=$rez";

?>
