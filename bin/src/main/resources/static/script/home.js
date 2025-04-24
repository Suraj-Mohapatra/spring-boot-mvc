fetch('./getSessionId')
	.then(response => response.text())
	.then(data => {
		const paragraph = document.createElement('p');
		paragraph.textContent = data;
		document.body.appendChild(paragraph);
	})
	.catch(error => console.error('Error:', error));
