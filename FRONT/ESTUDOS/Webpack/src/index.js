const BASE_URL = 'https://cep.awesomeapi.com.br/json/91050001';

axios.get(BASE_URL)
    .then(function (response) {

        const main = document.createElement('main');
        document.body.appendChild(main);

        HTMLBr = document.createElement('br');

        const title = document.createElement('h1');
        title.textContent = 'BUSCA POR CEP';
        main.appendChild(title);

        const address = document.createElement('h2');
        address.textContent = `Address : ${response.data.address}`;
        main.appendChild(address);

        const cep = document.createElement('strong');
        const cepValue = document.createElement('p');
        cepValue.textContent = response.data.cep;
        cep.textContent = `CEP : ${cepValue.textContent}`
        main.appendChild(cep);

        const city = document.createElement('strong');
        const cityValue = document.createElement('p');
        cityValue.textContent = response.data.city;
        city.textContent = ` - City : ${cityValue.textContent}`;
        main.appendChild(city);

        const state = document.createElement('strong');
        const stateValue = document.createElement('p');
        stateValue.textContent = response.data.state;
        state.textContent = ` - State : ${stateValue.textContent}`;
        main.appendChild(state);

        const city_ibge = document.createElement('strong');
        const city_ibge_value = document.createElement('p');
        city_ibge_value.textContent = response.data.city_ibge;
        city_ibge.textContent = ` - City IBGE : ${city_ibge_value.textContent}`;
        main.appendChild(city_ibge);

        main.appendChild(HTMLBr);

        const district = document.createElement('strong');
        const districtValue = document.createElement('p');
        districtValue.textContent = response.data.district;
        district.textContent = `District : ${districtValue.textContent}`;
        main.appendChild(district);

        const latitude = document.createElement('strong');
        const latitudeValue = document.createElement('p');
        latitudeValue.textContent = response.data.lat;
        latitude.textContent = ` - Latitude : ${latitudeValue.textContent}`;
        main.appendChild(latitude);

        const longitude = document.createElement('strong');
        const longitudeValue = document.createElement('p');
        longitudeValue.textContent = response.data.lng;
        longitude.textContent = ` - Longitude : ${longitudeValue.textContent}`;
        main.appendChild(longitude);
    });