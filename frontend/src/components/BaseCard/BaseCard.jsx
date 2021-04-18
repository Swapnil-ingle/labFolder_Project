import React from "react";

import "./BaseCard.css";

const BaseCard = () => {
  return (
    <main>
      <div className="card-title">
        <h2>Word Processor</h2>
      </div>
      <div className="notebook-data-query-div">
        <input
          placeholder="Enter your word"
          className="inset-btn"
          type="text"
        />
        <section className="query-btns-section">
          <button className="raise-btn">Frequency</button>
          <button className="raise-btn">Similarity</button>
        </section>
      </div>
      <div className="result">
        <p>
          This word occurs <i>1 times</i> in the notebook.
        </p>
        <p className="hide">Similar words from the notebook: 'Apples'.</p>
      </div>
      <section className="notebook-data-div">
        <article>Apple Orange Banana Apples</article>
        <p>Data from notebook</p>
      </section>
    </main>
  );
};

export default BaseCard;
