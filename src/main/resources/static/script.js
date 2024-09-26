const playerList = document.getElementById('playerList');
const playerForm = document.getElementById('playerForm');

const apiUrl = '/players';

async function fetchPlayers() {
    const response = await fetch(apiUrl);
    const players = await response.json();
    displayPlayers(players);
}

function displayPlayers(players) {
    playerList.innerHTML = '';
    players.forEach(player => {
        const li = document.createElement('li');
        li.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'align-items-center');
        li.textContent = `${player.name} - ${player.team} - ${player.position} - ${player.age} años`;

        // Contenedor para los botones
        const buttonContainer = document.createElement('div');

        // Botón de actualización
        const updateButton = document.createElement('button');
        updateButton.classList.add('btn', 'btn-warning', 'btn-sm', 'mr-2'); // Añadido margen a la derecha
        updateButton.textContent = 'Actualizar';
        updateButton.onclick = () => updatePlayer(player);

        // Botón de borrado
        const deleteButton = document.createElement('button');
        deleteButton.classList.add('btn', 'btn-danger', 'btn-sm');
        deleteButton.textContent = 'Borrar';
        deleteButton.onclick = () => deletePlayer(player.id);

        // Añadir botones al contenedor
        buttonContainer.appendChild(updateButton);
        buttonContainer.appendChild(deleteButton);

        // Añadir el contenedor de botones a la lista
        li.appendChild(buttonContainer);
        playerList.appendChild(li);
    });
}

playerForm.addEventListener('submit', async (e) => {
    e.preventDefault();

    const newPlayer = {
        name: document.getElementById('name').value,
        team: document.getElementById('team').value,
        position: document.getElementById('position').value,
        age: parseInt(document.getElementById('age').value)
    };

    await fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(newPlayer)
    });

    playerForm.reset();
    fetchPlayers();
});

async function updatePlayer(player) {
    const newName = prompt("Nuevo Nombre:", player.name);
    const newTeam = prompt("Nuevo Equipo:", player.team);
    const newPosition = prompt("Nueva Posición:", player.position);
    const newAge = prompt("Nueva Edad:", player.age);

    if (newName && newTeam && newPosition && newAge) {
        const updatedPlayer = {
            name: newName,
            team: newTeam,
            position: newPosition,
            age: parseInt(newAge)
        };

        await fetch(`${apiUrl}/${player.id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(updatedPlayer)
        });

        fetchPlayers();
    }
}

async function deletePlayer(id) {
    if (confirm("¿Estás seguro de que deseas borrar este jugador?")) {
        await fetch(`${apiUrl}/${id}`, {
            method: 'DELETE'
        });
        fetchPlayers();
    }
}

// Fetch players on initial load
fetchPlayers();
