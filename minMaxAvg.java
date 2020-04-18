function minMaxAverage(arr)
{
	var sum = 0;
	var min = arr[0];
	var max = arr[0];
	
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>max)
		{
			max = arr[i];
		}
		if (arr[i]<min)
		{
			min = arr[i];
		}
		sum=sum+arr[i];
	}
	var avg = sum/arr.length;
	console.log(max);
	console.log(min);
	console.log(avg);
}
