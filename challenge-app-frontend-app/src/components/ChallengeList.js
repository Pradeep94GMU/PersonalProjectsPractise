

function ChallengeList({challenges}) {
    return(
        <div>
            {challenges.map(challenge => (

                <div key={challenge.id}>
                    <h2>{challenge.month}</h2>
                    <p>{challenge.description}</p>
                </div>

            ))}

        </div>
    );
}

export default ChallengeList;