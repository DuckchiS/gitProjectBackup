const API_KEY = "test_d101652904df6b58ef540a48653d7217d23ee7ea22014742e2004f28b02dad90b11206025f65fce822c9f5402cb8b869";

function submitForm(event) {
  event.preventDefault(); // 폼 제출 이벤트 기본 동작 방지

  const userName = document.getElementById("username").value;

  fetchUserOuid(userName);
}

function fetchUserOuid(userName) {
    const urlString = "https://open.api.nexon.com/fconline/v1/id?nickname=" + userName;

  // 첫 번째 요청
  fetch(urlString, {
    headers:{
      "x-nxopen-api-key": API_KEY
    }
  })
  .then(response => response.json())
  .then(data => {
    console.log("첫 번째 요청 결과:", data);
    const userOuid = data.ouid; // 첫 번째 요청 결과에서 ouid 값을 추출

    // 두 번째 요청
    const urlString2 = "https://open.api.nexon.com/fconline/v1/user/basic?ouid=" + userOuid;
    return fetch(urlString2, {
      headers:{
        "x-nxopen-api-key": API_KEY
      }
    });
  })
  .then(response => response.json())
  .then(data => {
    console.log("두 번째 요청 결과:", data);
    
    const userOuid = data.ouid; // 두 번째 요청 결과에서 ouid 값을 추출
    const nickname = data.nickname; // 두 번째 요청 결과에서 nickname 값을 추출
    const level = data.level; // 두 번째 요청 결과에서 level 값을 추출
    $("#user1_area").text("이름: " + nickname);
    $("#user2_area").text("레벨: " + level);

    // 세 번째 요청
    const urlString3 = "https://open.api.nexon.com/fconline/v1/user/maxdivision?ouid=" + userOuid;
    return fetch(urlString3, {
      headers:{
        "x-nxopen-api-key": API_KEY
      }
    });
  })
  .then(response => response.json())
  .then(data => {
    console.log("세 번째 요청 결과:", data);

    // 세 번째 요청 결과에서 필요한 데이터를 추출하여 활용할 수 있음
    const divisionData = data;
    $("#user3_area").text("최고티어: " + divisionData);
  })
  .catch(error => console.error(error));
}
